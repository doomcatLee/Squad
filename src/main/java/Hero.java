import java.util.List;
import java.util.ArrayList;

public class Hero{
  private String mName;
  private String mElement;
  private int mHealth;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mId;


  public Hero(String a, String b, int c){
    mName = a;
    mElement = b;
    mHealth = c;
    instances.add(this);
    mId = instances.size();
  }

  public String getName(){
    return mName;
  }

  public String getElement(){
    return mElement;
  }

  public int getHealth(){
    return mHealth;
  }

  public static List<Hero> all(){
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Hero find(int id) {
    return instances.get(id - 1);
  }


}
