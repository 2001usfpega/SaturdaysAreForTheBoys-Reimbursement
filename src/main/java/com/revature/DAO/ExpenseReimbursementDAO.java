package com.revature.DAO;

import com.revature.model.Employee;
import com.revature.model.ExpenseReimbursement;

import java.util.List;

public interface ExpenseReimbursementDAO {

    void reimburseLogIn(String uName, String pWord);

    void employeeSubmitReimburse(int rType, double rAmount, String empFK, String descrip);

    List<ExpenseReimbursement> viewAllReimburseReq();

    void resolveReimburse(String finManForeignKey, boolean approved, int reimburseID);

    Employee login(String man_username, String man_password);

    List<ExpenseReimbursement> viewPending();
}