package com.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.account.model.Accounts;
import com.account.repository.AccountsRepository;

@Controller
public class AccountsController {
	
	@Autowired
	private AccountsRepository accountsRepository;
	
	@GetMapping("/myAccount/{customerId}")
	public @ResponseBody Accounts getAccountDetails(@PathVariable("customerId") int customerId) {
		return accountsRepository.findByCustomerId(customerId);
	}

}
