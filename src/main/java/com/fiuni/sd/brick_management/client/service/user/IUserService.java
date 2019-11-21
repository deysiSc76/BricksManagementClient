package com.fiuni.sd.brick_management.client.service.user;

import com.fiuni.sd.brick_management.client.beans.budgetDetail.BudgetDetailB;
import com.fiuni.sd.brick_management.client.beans.user.UserB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailDTO;
import com.fiuni.sd.bricks_management.dto.user.UserDTO;

public interface IUserService extends IBaseService<UserB, UserDTO> {
    public void delete(int id);

}
