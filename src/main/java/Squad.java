import java.util.List;
import java.util.ArrayList;

public class Squad{
  private String mName;
  private Hero mHero;
  private static List<Squad> instances1 = new ArrayList<Squad>();
  private int mId;
  private List<Hero> mHeros;

  public Squad(String a){
    mName = a;
    instances1.add(this);
    mId = instances1.size();
    mHeros = new ArrayList<Hero>();
  }

  public String getName(){
    return mName;
  }

  public Hero getHero(){
    return mHero;
  }

  public static List<Squad> all(){
    return instances1;
  }

  public static void clear() {
    instances1.clear();
  }

  public int getId() {
    return mId;
  }

  public int getHeroId(Hero hero){
    int id = mHeros.indexOf(hero) + 1;
    return id;
  }

  public static Squad find(int id) {
    return instances1.get(id-1);
  }

  public List<Hero> getHeros(){
    return mHeros;
  }

  public void addHero(Hero hero) {
    mHeros.add(hero);
  }

}
