package com.fiuni.sd.brick_management.client.service.charge;

import bricksmanagementclient.Charge;
import com.fiuni.sd.brick_management.client.beans.budget.BudgetB;
import com.fiuni.sd.brick_management.client.beans.charge.ChargeB;
import com.fiuni.sd.brick_management.client.beans.paymentDetail.PaymentDetailB;
import com.fiuni.sd.brick_management.client.rest.budget.IBudgetResource;
import com.fiuni.sd.brick_management.client.rest.charge.IChargeResource;
import com.fiuni.sd.brick_management.client.rest.user.IUserResource;
import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;

import com.fiuni.sd.bricks_management.dto.charge.ChargeDTO;
import com.fiuni.sd.bricks_management.dto.charge.ChargeResult;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service("chargeService")
public class ChargeServiceImpl extends BaseServiceImpl<ChargeB, ChargeDTO> implements IChargeService{
        @Autowired
        private IChargeResource _chargeResource;
        @Autowired
        private IBudgetResource budgetResource;
        @Autowired
        private IUserResource userResource;

        @Override
        @Transactional
        public ChargeB save(ChargeB bean) {
            final ChargeDTO dto = convertBeanToDto(bean);
            final ChargeDTO chargeDTO = _chargeResource.save(dto);
            return convertDtoToBean(chargeDTO);
        }

    @Override
    public ChargeB getById(Integer id) {
        ChargeDTO dto = _chargeResource.getById(id);
        return convertDtoToBean(dto);
    }
    @Override
    public List<ChargeB> getAll(Integer page) {
        final ChargeResult result = _chargeResource.getAll(page);
        final List<ChargeDTO> cList = null == result.getCharges() ? new ArrayList<ChargeDTO>()
                : result.getCharges();

        final List<ChargeB> charges = new ArrayList<ChargeB>();
        for (ChargeDTO dto : cList) {
            final ChargeB bean = convertDtoToBean(dto);
            charges.add(bean);
        }
        return charges;
    }
    @Override
    public List<ChargeB> getByDate(String date, Integer page) {
        final List<ChargeB> charges = new ArrayList<>();
        ChargeResult results = _chargeResource.getByDate(date, page);
        results.getCharges().forEach(charge -> charges.add(convertDtoToBean(charge)));
        return charges;
    }
    @Override
    protected ChargeB convertDtoToBean(ChargeDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null){
            props.put("id", dto.getId().toString());
        }
        props.put("date", dto.getDate() + "");
        props.put("description", dto.getDescription() + "");
        props.put("amount", dto.getAmount() + "");
        props.put("budgetId", dto.getBudgetId() + "");
        props.put("clientId", dto.getClientId() + "");
        return new ChargeB(props);
    }
    @Override
    protected ChargeDTO convertBeanToDto(ChargeB bean) {
        ChargeDTO dto = new ChargeDTO();
        dto.setId(bean.getId());
        dto.setDate(bean.getDate());
        dto.setAmount(bean.getAmount());
        dto.setDescription(bean.getDescription());
        dto.setBudgetId(bean.getBudget_id());
        dto.setClientId(bean.getClient_id());
        return dto;
    }


}
