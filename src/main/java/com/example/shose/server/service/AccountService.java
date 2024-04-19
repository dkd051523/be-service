package com.example.shose.server.service;

import com.example.shose.server.dto.response.account.AccountResponse;
import com.example.shose.server.entity.Account;
import com.example.shose.server.dto.response.employee.SimpleEmployeeResponse;

import java.util.List;

/**
 * @author Nguyễn Vinh
 */
public interface AccountService {

    List<Account> findAll ();

    Account getOneByEmail(String email);

    AccountResponse getAccountUserByIdBill( String idBill );

    List<SimpleEmployeeResponse> getAllSimpleEntityEmployess();

}
