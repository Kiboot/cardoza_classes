package mcm.edu.ph.cardoza_classes;

public class Hero {
    String heroName="";
    double statSTR = 0.0;
    double statAGI = 0.0;
    double statINT = 0.0;
    int heroLvl = 0;
    int baseHealth = 0;
    int baseMana = 0;
    double armor = 0.0;

    int totalHealth(){
        return (int)(statSTR*20)+baseHealth;
    }


    void executeAttack(double statSTR){
    }
    public Hero(String heroName, double statSTR, double statAGI, double statINT, int heroLvl, int baseHealth, int baseMana, double armor){
        this.heroName = heroName;
        this.statSTR = statSTR;
        this.statAGI = statAGI;
        this.statINT = statINT;
        this.heroLvl = heroLvl;
        this.baseHealth = baseHealth;
        this.baseMana = baseMana;
        this.armor = armor;

    }

    public Hero(double statSTR, double statAGI, double statINT){
        this.statSTR = statSTR;
        this.statAGI = statAGI;
        this.statINT = statINT;
    }
    public Hero(){

    }




}
