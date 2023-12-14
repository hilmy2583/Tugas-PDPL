package Pertemuan11;

// This is the adapter class  

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name: ");
            String customername = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number: ");
            long accno = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name: ");
            String bankname = br.readLine();
            System.out.print("\n");

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        String line = "======";
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();

        return (line + "\n" + "The Account number " + accno + " of " + accholdername + " in " + bname
                + " bank is valid and authenticated for issuing the credit card.\n" + line);
    }
}// End of the BankCustomer class.
