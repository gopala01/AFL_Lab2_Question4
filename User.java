public class User{

    private String name;
    private int numAccounts;
    private Account[] accountArray;

    public User(String name){
        this.name = name;
        this.numAccounts = 0;
        this.accountArray = new Account[12];

    }

    public void setName(String name){ this.name = name;}


    public String getName(){ return this.name;}

    public int getFunds(){
        int total = 0;
        for (int i = 0; i < numAccounts; i++) {
            total = total + this.accountArray[i].getBalance();
        }
        return total;
    }

    public void addAccount(Account acc){


        if (this.numAccounts > 2){
            System.out.println("ERROR");
        }
        else {
            this.accountArray[numAccounts] = acc;
            this.numAccounts++;
        }


    }
    public void deposit(int account, int amount){
        if (account > 2 || this.accountArray[0] == null){
            System.out.println("ERROR");
        }
        else {
            this.accountArray[account-1].deposit(amount);
        }
    }
    public void withdraw(int account, int amount){
        if (account >= this.numAccounts || this.numAccounts == 0){
            System.out.println("ERROR");
        }
        else {
            accountArray[account].withdraw(amount);
        }
    }

    public double calculateEarnings(){
        double total = 0;
        for (int i = 0; i < this.numAccounts; i++) {
            int n = this.accountArray[i].getBalance();
            Double amount = Double.valueOf(n);
            total = total + (this.accountArray[i].getInterest()*amount);
        }
        return total;
    }
    public String generateReport(){
        return "Name: <" + this.getName() + ">. Funds: <" + this.getFunds() +">";
    }
}
