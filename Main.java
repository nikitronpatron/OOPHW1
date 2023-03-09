// Создать класс Player с полями id (long), name (String), damage (double) healthPoint (hp) (double) 
// У класса должен быть конструктор, который принимает только name. 
// Идентификатор присваивается автоматически из последовательности (1, 2, ...) 
// Каждый класс должен уметь "бить" другого Player'а void attack(Player player) -> player1.attack(player2) 
// Внутри метода игрок, на котором вызван метод уменьшает здоровье игрока, который передан в метод 
// Придумать несколько классов с разными параметрами жизней и атаки по-умолчанию Player player = new Tank("name");
// * Придумать, все, что захочется и обогатить проект
// Понасоздавать объектов и стравить их друг с другом

public class Main 
{
    
    public static void main(String[] args) 
    {
        CombatUnit first = new Player("Bot1", 100, 50);
        CombatUnit second = new Player("Bot2", 100, 50);
        CombatUnit art = new Artillery("Art", 500, 500);
        CombatUnit tank1 = new Tank("E50M", 2000, 100);
        CombatUnit tank2 = new Tank("Sheridan", 2000, 500);
        CombatUnit hel = new Helicopter("Helicopter", 750, 500);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(art);
        System.out.println(tank1);
        System.out.println(tank2);
        System.out.println(hel);
        
        try 
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        first.Attack(second);
        second.Attack(art);
        art.Attack(tank2);
        tank2.Attack(tank1);
        hel.Attack(tank1);
        tank1.Attack(hel);
        tank1.Attack(art);
        
        System.out.println();
        System.out.println(first);
        System.out.println(second);
        System.out.println(art);
        System.out.println(tank1);
        System.out.println(tank2);
        System.out.println(hel);

        try 
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        first.Attack(art);
        first.Attack(hel);
        second.Attack(first);
        second.Attack(hel);
        first.Attack(second);
        first.Attack(hel);
        tank1.Attack(tank2);
        tank1.Attack(hel);

        System.out.println();
        System.out.println(first);
        System.out.println(second);
        System.out.println(art);
        System.out.println(tank1);
        System.out.println(tank2);
        System.out.println(hel);

        try 
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        hel.Attack(tank2);
        hel.Attack(tank1);
        first.Attack(hel);
        tank1.Attack(hel);
        tank1.Attack(art);
        first.Attack(art);

        System.out.println();
        System.out.println(first);
        System.out.println(second);
        System.out.println(art);
        System.out.println(tank1);
        System.out.println(tank2);
        System.out.println(hel);
        
        try 
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        hel.Attack(tank2);
        first.Attack(tank2);
        first.Attack(hel);
        first.Attack(tank2);
        tank1.Attack(tank2);

        System.out.println();
        System.out.println(first);
        System.out.println(second);
        System.out.println(art);
        System.out.println(tank1);
        System.out.println(tank2);
        System.out.println(hel);

        try 
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        first.Attack(art);
        first.Attack(hel);
        first.Attack(tank2);
        tank1.Attack(art);
        first.Attack(hel);
        tank1.Attack(tank2);
        first.Attack(hel);
        tank2.Attack(tank1);
        first.Attack(hel);
        first.Attack(tank2);

        System.out.println();
        System.out.println(first);
        System.out.println(second);
        System.out.println(art);
        System.out.println(tank1);
        System.out.println(tank2);
        System.out.println(hel);
        
        try 
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        first.Attack(first);

        System.out.println();
        System.out.println(first);
        System.out.println(second);
        System.out.println(art);
        System.out.println(tank1);
        System.out.println(tank2);
        System.out.println(hel);
        System.out.println("nobody win");
    }
}