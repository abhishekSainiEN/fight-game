package java fight;

import java.util.*;
 
 
 
 
class player1{
  String name;
  String weapon;
  String weapon2;
  int health;
  player1(String name,String weapon,String weapon2,int health){
    this.health=health;
    this.weapon=weapon;
    this.weapon2=weapon2;
    this.name=name;
    if(health <0 || health >100){
        this.health=100;
    }
    else{
        this.health=health;
    }
  }
  public void damageByWeapon1(){
    this.health -=30;
    if(this.health <=0){
        this.health=0;
    }
    System.out.println("player hit by gun1."+"a health is reduced by 30."+".new heath is"+this.health);
    if(this.health==0){
        System.out.println("your  are died:"+getName());
    }
   }
   void damageByWeapon2(){
    this.health -=50;
    if(this.health <=0){
        this.health=0;
    }
    System.out.println("player hit by gun1."+"a health is reduced by 50."+".new heath is"+this.health);
    if(this.health==0){
        System.out.println("you are died:"+getName());
    }
   }
   void heel(){
    if(this.health < 0){
        System.out.println("you are deid .you do not use heel");
    }else{
            this.health=100;
            System.out.println("health."+this.health);
    }
   }
   public String getName(){
            return name;
            
  }
  public void setWeapon2(String weapon2){
        this.weapon2=weapon2;
  }
        
  public String getWeapon(){
            return weapon;
            
  }
  public int getHealth(){
            return health;
            
  }
  public void setName(String name){
   this.name=name;
            
  }
  public String Weapon2(){
    return weapon2;
  }
  public void setWeapon(String weapon){
   this.weapon=weapon;
  }
  public void setHealth(int health){
            this.health=health;
  }
  void printDetail(){
    System.out.println("player1 name="+name);
    System.out.println("health ="+health);
    System.out.println("weapon1 ="+weapon);
    System.out.println("weapon2="+weapon2);
  }
}
 
 
 
 
 
class player2 extends player1{
   int health;
   boolean armour;
   player2(String name,String weapon,String weapon2,int health,boolean armour){
            super(name,weapon,weapon2,health);
 this.health=health;
 this.armour=armour;
   }
   
    void damamageByWeapon1(){
                        if(armour){
                            this.health -=20;
 if(this.health<=0)this.health=0;
    System.out.print("your armour is on"+"your health reduce by 20"+"your new health is:"+this.health);
    }
    if(!armour){
                        this.health=-40;
                        if(this.health<=0)this.health=0;
                        System.out.println("your armour is off:your health was reduce by 40:new health is:"+this.health);
    }
    if(this.health==0){
    System.out.println(getName()+":is dead");
    }else{
                                                System.out.println("invalid");
                                                }
                                                }
                                                 void damageByWeapon2(){
                                                    if(armour){
                                            this.health -=30;
  if(this.health <=0)this.health=0;
  System.out.println("your armour is on : your helath is reduce by 30 : new health is:"+this.health);
  }
  if(!armour){
                                                this.health -=50;
                                                if(this.health <=0)this.health=0;
                                                System.out.println("your armour is off : your health is reduced by 50:new health is:"+this.health);
                                                }
                                                if(this.health==0){
                                                    
                                                    System.out.println(getName()+":is dead");                                                                   }
                                                    }
                                                    void heel() {
        super.heel();
                            }
                            void printDetail(){
                                                        System.out.println("player2 name="+name);
    System.out.println("health ="+health);
    System.out.println("weapon1 ="+weapon);
    System.out.println("weapon2="+weapon2);
    System.out.println("armour status:"+armour);
                                                        }
                                                        }               
                                                
                        
            
            
  
 
  
    class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("give command for select player type  to play this game: 1 :for player1 and :2:for player2 ");
        int select=sc.
        nextInt();
        switch(select){
            case 1:
            System.out.println("you choose player 1 without armour");
            player1 p=new player1("Abhishek","m4","Scare-l",100);
    p.printDetail();
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println("ready for fight");  System.out.println("press 1 for gun 1 \n press 2 for gun2 \n press 3 for heel");
System.out.println("Give action for use command");
int comm=sc.nextInt();
 
if(comm==1){
    
    p.damageByWeapon1();
    System.out.println("name of weapon:"+p.getWeapon());
}else if(comm==2){
    p.damageByWeapon2();
    
}else if(comm==3){
    p.heel();
 
}else{
    System.out.println("nothing");
 
 
    
    
System.out.println("+++++++++++++++++++++++++++++++++++++");
}
break;  
    case 2:
    System.out.println("you choose player2 with armour");
    player2 p1=new
     player2("danny","m24","akm",100,true);
    p1.printDetail();
    
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println("ready for fight");  
    System.out.println("press 1 for gun 1 \n press 2 for gun2 \n press 3 for heel");
System.out.println("Give option for use command");
 
int com=sc.nextInt();
 
if(com==1){
    
    p1.damageByWeapon1();
    System.out.println("name of weapon:"+p1.getWeapon());
}else if(com==2){
    p1.damageByWeapon2();
    
}else if(com==3){
    p1.heel();
 
}else{
    System.out.println("nothing");
 
 
    
    
System.out.println("+++++++++++++++++++++++++++++++++++++");
play ++;
 
    
 
 
    break;
}
    default:
    System.out.println("nothing");
 
 
    }   
    }
}
