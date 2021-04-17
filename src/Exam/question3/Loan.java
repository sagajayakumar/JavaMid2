/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam.question3;

/**
 *
 * @author S542392
 */
public class Loan {
    private long loanId;
    private double amount;

    /** COnstructor for loan
     * 
     * @param loanId
     * @param amount 
     */
    public Loan(long loanId, double amount) {
        this.loanId = loanId;
        this.amount = amount;
    }

    /** getter method for loan id
     * 
     * @return loan id
     */
    public long getLoanId() {
        return loanId;
    }

    /** setter method for loan id
     * 
     * @param loanId 
     */
    public void setLoanId(long loanId) {
        this.loanId = loanId;
    }

    /** getter method for amount
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /** setter method for amount
     * 
     * @param amount 
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /** converts the constructor to string
     * 
     * @return string
     */
    @Override
    public String toString() {
        return "loanId=" + loanId + ", amount=" + amount;
    }
}
