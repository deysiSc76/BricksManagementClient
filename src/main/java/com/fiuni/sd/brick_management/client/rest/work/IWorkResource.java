package com.fiuni.sd.brick_management.client.rest.work;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.work.WorkDTO;
import com.fiuni.sd.bricks_management.dto.work.WorkResult;
import org.springframework.stereotype.Repository;

@Repository("workResource")
public interface IWorkResource extends IBaseResource<WorkDTO> {
    public WorkResult getAll(Integer page);
    public void delete(Integer id);
}
