package Encapsulation;



public class Encap {
    private float balance;

    public Encap(float initial_balance){
        this.balance = initial_balance;
    }

    public float get_balance(){
        return balance;
    }
    public String add(float amount){
        balance += amount;
        return "Amount added";
    }

    public void withdraw(float amt){
        if (balance < amt){
            System.out.println("Declined");
        }
        else{
            balance -=amt;
            System.out.println("Amount withdrawn");
        }

    }
    public static void main(String[] args) {
        Encap account = new Encap(1000);
        account.add(500);
        account.withdraw(200);
        System.out.println("Balance: " + account.get_balance()); // Accessing balance through getter
    }

}

