package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoansDto;

public interface ILoansService {

    /**
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createLoan(String mobileNumber);

    /**
     * @param mobileNumber - Mobile Number of the Customer
     * @return Loans Details based on a given MobileNumber
     */
    LoansDto fetchLoan(String mobileNumber);

    /**
     * @param loansDto - LoansDto Object
     * @return boolean indicating if the update of loan details is successful or not
     */
    boolean updateLoan(LoansDto loansDto);

    /**
     * @param mobileNumber - Mobile Number of the Customer
     * @return boolean indicating if the delete of loan details is successful or not
     */
    boolean deleteLoan(String mobileNumber);

}