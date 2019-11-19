package com.fiuni.sd.brick_management.client.service.charge;

import com.fiuni.sd.brick_management.client.beans.budget.BudgetB;
import com.fiuni.sd.brick_management.client.beans.charge.ChargeB;
import com.fiuni.sd.brick_management.client.rest.budget.IBudgetResource;
import com.fiuni.sd.brick_management.client.rest.charge.IChargeResource;
import com.fiuni.sd.brick_management.client.rest.user.IUserResource;
import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;

import com.fiuni.sd.bricks_management.dto.charge.ChargeDTO;
import com.fiuni.sd.bricks_management.dto.charge.ChargeResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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
    public ChargeResult getByDate(String date, Pageable pageable) {
        final List<ChargeDTO> charges = new ArrayList<>();
        Page<ChargeDomain> results = _chargeResource.findByDate(date, pageable);
        results.forEach(charge -> charges.add(convertDomainToDto(charge)));

        final ChargeResult chargeResult = new ChargeResult();
        chargeResult.setCharges(charges);
        return chargeResult;
    }

    }
