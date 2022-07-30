public abstract class Player<T> {
    private String name;
     public Player (T name){
         this.name = (String) name;
     }

     public String getName(){
         return name;
     }


}
