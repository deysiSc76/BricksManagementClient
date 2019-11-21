package com.fiuni.sd.brick_management.client.service.work;

import com.fiuni.sd.brick_management.client.beans.budgetDetail.BudgetDetailB;
import com.fiuni.sd.brick_management.client.beans.work.WorkB;
import com.fiuni.sd.brick_management.client.rest.budgetDetail.IBudgetDetailResource;
import com.fiuni.sd.brick_management.client.rest.work.IWorkResource;
import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;
import com.fiuni.sd.brick_management.client.service.budgetDetail.IBudgetDetailService;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailDTO;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailResult;
import com.fiuni.sd.bricks_management.dto.work.WorkDTO;
import com.fiuni.sd.bricks_management.dto.work.WorkResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("workService")
public class WorkServiceImpl extends BaseServiceImpl<WorkB, WorkDTO> implements IWorkService {
    @Autowired
    IWorkResource workResource;

    @Override
    protected WorkB convertDtoToBean(WorkDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null){
            props.put("id", dto.getId().toString());
        }
        props.put("address", dto.getAddress()+ "");
        props.put("description", dto.getDescription() + "");
        props.put("name", dto.getName() + "");
        props.put("personalManager", dto.getPersonnelManager()+ "");
        props.put("clientId", dto.getClientId()+ "");
        props.put("startDate", dto.getStartDate()+ "");
        props.put("endDate", dto.getEnd_date()+ "");
        return new WorkB(props);
    }
    @Override
    protected WorkDTO convertBeanToDto(WorkB bean) {
        WorkDTO dto = new WorkDTO();
        dto.setId(bean.getId());
        dto.setAddress(bean.getAddress());
        dto.setDescription(bean.getDescription());
        dto.setName(bean.getName());
        dto.setClientId(bean.getClientId());
        dto.setPersonnelManager(bean.getPersonnelManager());
        dto.setStartDate(bean.getStartDate());
        dto.setEnd_date(bean.getEnd_date());
        return dto;
    }
    @Override
    public void delete(int id) {
        workResource.delete(id);
    }

    @Override
    public WorkB save(WorkB bean) {
        WorkDTO dto = workResource.save(convertBeanToDto(bean));
        return convertDtoToBean(dto);
    }
    @Override
    public List<WorkB> getAll(Integer page) {
        WorkResult works = workResource.getAll(page);
        List<WorkB> workBeans = new ArrayList<>();
        works.getWorks().forEach(WorkDTO -> workBeans.add(convertDtoToBean(WorkDTO)));
        return workBeans;
    }
    @Override
    public WorkB getById(Integer id) {
        WorkDTO dto = workResource.getById(id);
        return convertDtoToBean(dto);
    }
}
