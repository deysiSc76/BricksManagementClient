package com.fiuni.sd.brick_management.client.service.work;

import com.fiuni.sd.brick_management.client.beans.work.WorkB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.work.WorkDTO;

public interface IWorkService extends IBaseService<WorkB, WorkDTO> {
public void delete(int id);

        }
