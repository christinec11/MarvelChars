import java.sql.Connection;  
 import java.sql.DriverManager;  
 import java.sql.ResultSet;  
 import java.sql.Statement;  
 public class MarvelDatabase 
 {  
  public static void main(String[] args) 
  {  
     Connection conn = null;  
     ResultSet rs = null;  
     Statement statement = null;  

     try 
     {  

      

         Class.forName("org.sqlite.JDBC");  
         conn = DriverManager.getConnection("jdbc:sqlite:D:\\Marvel Characters.csv");  
         statement = conn.createStatement();  

        statement.setQueryTimeout(30);  // set timeout to 30 sec.
        statement.executeUpdate("drop table if exists NAMES");
        statement.executeUpdate("create table NAMES (charname String, birthname String)))");
        statement.executeUpdate("insert into NAMES values('Silk', 'Cindy Moon')");
        statement.executeUpdate("insert into NAMES values('Snowbird', 'Narya')");
        statement.executeUpdate("insert into NAMES values('Thunderbird', 'John Proudstar')");
        statement.executeUpdate("insert into NAMES values('Cannonball', 'Samuel Zachery Guthrie')");
        statement.executeUpdate("insert into NAMES values('Shriek', 'Frances Louise Barrison')");
        statement.executeUpdate("insert into NAMES values('Galactus', 'Galan')");
        statement.executeUpdate("insert into NAMES values('Harry Osborn', 'Harold Theopolis Osborn')");
        statement.executeUpdate("insert into NAMES values('Chris Bradley', 'Christopher Bradley')");
        statement.executeUpdate("insert into NAMES values('Ultimate Magneto', 'Erik Lensherr')");
        statement.executeUpdate("insert into NAMES values('Magneto', 'Max Eisenhardt')");
        statement.executeUpdate("insert into NAMES values('Ultimate Angel', 'Warren Worhtington III')");
        statement.executeUpdate("insert into NAMES values('Vulcan', 'Gabriel Summers')");
        statement.executeUpdate("insert into NAMES values('Kitty Pryde', 'Katherine Anne Pryde')");
        statement.executeUpdate("insert into NAMES values('Wolfsbane', 'Rahne Sinclair')");
        statement.executeUpdate("insert into NAMES values('Banshee', 'Sean Cassidy')");
        

         rs = statement.executeQuery("SELECT * FROM NAMES");  
         while (rs.next()) 
         {  
             System.out.println("Superhero Character Name:" + rs.getString("charname"));  
             System.out.println("Superhero Real Name:" + rs.getString("birthname"));
         }  

         statement.executeUpdate("drop table if exists TYPE");
         statement.executeUpdate("create table TYPE (charname string, types string, PRIMARY KEY(charname, types))");
         statement.executeUpdate("insert into TYPE values('Silk, 'Mutate')");
         statement.executeUpdate("insert into TYPE values('Silk, 'comics character')");
         statement.executeUpdate("insert into TYPE values('Snowbird, 'demigod or quasi-deity in a work of fiction')");
         statement.executeUpdate("insert into TYPE values('Snowbird, 'comics character')");
         statement.executeUpdate("insert into TYPE values('Thunderbird, 'television character')");
         statement.executeUpdate("insert into TYPE values('Thunderbird, 'animated character')");
         statement.executeUpdate("insert into TYPE values('Thunderbird, 'mutant')");
         statement.executeUpdate("insert into TYPE values('Cannonball, 'superhero film character')");
         statement.executeUpdate("insert into TYPE values('Cannonball, 'animated character')");
         statement.executeUpdate("insert into TYPE values('Cannonball, 'mutant')");
         statement.executeUpdate("insert into TYPE values('Shriek, 'film character')");
         statement.executeUpdate("insert into TYPE values('Shriek, 'comics character')");
         statement.executeUpdate("insert into TYPE values('Galactus, 'fictional humanoid extraterrestrial')");
         statement.executeUpdate("insert into TYPE values('Galactus, 'cosmic entity')");
         statement.executeUpdate("insert into TYPE values('Galactus, 'comics character')");
         statement.executeUpdate("insert into TYPE values('Harry Osborn, 'superhero film character')");
         statement.executeUpdate("insert into TYPE values('Harry Osborn, 'animated character')");
         statement.executeUpdate("insert into TYPE values('Harry Osborn, 'mutate')");
         statement.executeUpdate("insert into TYPE values('Harry Osborn, 'comics character')");
         statement.executeUpdate("insert into TYPE values('Chris Bradley, 'superhero film character')");
         statement.executeUpdate("insert into TYPE values('Chris Bradley, 'mutant')");
         statement.executeUpdate("insert into TYPE values('Ultimate Magneto, 'mutant')");
         statement.executeUpdate("insert into TYPE values('Magneto, 'superhero film character')");
         statement.executeUpdate("insert into TYPE values('Magneto, 'animated character')");
         statement.executeUpdate("insert into TYPE values('Magneto, 'mutant')");
         statement.executeUpdate("insert into TYPE values('Magneto, 'comics character')");
         statement.executeUpdate("insert into TYPE values('Ultimate Angel, 'mutant')");
         statement.executeUpdate("insert into TYPE values('Vulcan, 'mutant')");
         statement.executeUpdate("insert into TYPE values('Kitty Pryde, 'animated character')");
         statement.executeUpdate("insert into TYPE values('Kitty Pryde, 'superhero film character')");
         statement.executeUpdate("insert into TYPE values('Kitty Pryde, 'mutant')");
         statement.executeUpdate("insert into TYPE values('Wolfsbane, 'comics character')");
         statement.executeUpdate("insert into TYPE values('Wolfsbane, 'superhero film character')");
         statement.executeUpdate("insert into TYPE values('Wolfsbane, 'werewolf in a work of fiction')");
         statement.executeUpdate("insert into TYPE values('Wolfsbane, 'animated character')");
         statement.executeUpdate("insert into TYPE values('Wolfsbane, 'mutant')");
         statement.executeUpdate("insert into TYPE values('Banshee, 'superhero film character')");
         statement.executeUpdate("insert into TYPE values('Banshee, 'animated character')");
         statement.executeUpdate("insert into TYPE values('Banshee, 'comics character')");
         statement.executeUpdate("insert into TYPE values('Banshee, 'mutant')");

         rs = statement.executeQuery("SELECT * FROM TYPE");  
         while (rs.next()) 
         {  
             System.out.println("Superhero Character Name:" + rs.getString("charname"));  
             System.out.println("Superhero Type:" + rs.getString("types"));
         }  

         statement.executeUpdate("drop table if exists POWERS");
         statement.executeUpdate("create table POWERS (charname string, superpower string, PRIMARY KEY(charname, superpower))");
         statement.executeUpdate("insert into POWERS values('Silk, 'superhuman agility / reflexes')");
         statement.executeUpdate("insert into POWERS values('Silk, 'superhuman durability')");
         statement.executeUpdate("insert into POWERS values('Silk, 'superhuman speed')");
         statement.executeUpdate("insert into POWERS values('Silk, 'superhuman strength')");
         statement.executeUpdate("insert into POWERS values('Snowbird, 'flight')");
         statement.executeUpdate("insert into POWERS values('Snowbird, 'shapeshifting')");
         statement.executeUpdate("insert into POWERS values('Snowbird, 'superhuman strength')");
         statement.executeUpdate("insert into POWERS values('Snowbird, 'retrocognition')");
         statement.executeUpdate("insert into POWERS values('Thunderbird, 'superhuman durability')");
         statement.executeUpdate("insert into POWERS values('Thunderbird, 'superhuman speed')");
         statement.executeUpdate("insert into POWERS values('Thunderbird, 'superhuman speed')");
         statement.executeUpdate("insert into POWERS values('Cannonball, 'thermo-chemical energy')");
         statement.executeUpdate("insert into POWERS values('Shriek, 'sonic scream')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'superhuman durability')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'superhuman speed')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'reality warping')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'teleportation')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'immortality')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'superhuman strength')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'levitation')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'force field')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'healing factor')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'psychokinesis')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'time traveling')");
         statement.executeUpdate("insert into POWERS values('Galactus, 'telepathy')");
         statement.executeUpdate("insert into POWERS values('Harry Osborn, 'superhuman strength')");
         statement.executeUpdate("insert into POWERS values('Harry Osborn, 'superhuman speed')");
         statement.executeUpdate("insert into POWERS values('Harry Osborn, 'superhuman durability')");
         statement.executeUpdate("insert into POWERS values('Harry Osborn, 'healing factor')");
         statement.executeUpdate("insert into POWERS values('Chris Bradley, 'technopathy')");
         statement.executeUpdate("insert into POWERS values('Chris Bradley, 'electrokinesis')");
         statement.executeUpdate("insert into POWERS values('Ultimate Magneto, 'magnetism manipulation')");
         statement.executeUpdate("insert into POWERS values('Magneto, 'magnetism manipulation')");
         statement.executeUpdate("insert into POWERS values('Magneto, 'electromagnetism manipulation')");
         statement.executeUpdate("insert into POWERS values('Ultimate Angel, 'flight')");
         statement.executeUpdate("insert into POWERS values('Vulcan, 'flight')");
         statement.executeUpdate("insert into POWERS values('Vulcan, 'power of mimicry or absorption')");
         statement.executeUpdate("insert into POWERS values('Vulcan, 'magnetism manipulation')");
         statement.executeUpdate("insert into POWERS values('Vulcan, 'electrokinesis')");
         statement.executeUpdate("insert into POWERS values('Vulcan, 'force field')");
         statement.executeUpdate("insert into POWERS values('Vulcan, 'healing factor')");
         statement.executeUpdate("insert into POWERS values('Kitty Pryde, 'intangibility')");
         statement.executeUpdate("insert into POWERS values('Wolfsbane, 'superhuman senses')");
         statement.executeUpdate("insert into POWERS values('Wolfsbane, 'superhuman speed')");
         statement.executeUpdate("insert into POWERS values('Wolfsbane, 'superhuman strength')");
         statement.executeUpdate("insert into POWERS values('Wolfsbane, 'lycanthropy')");
         statement.executeUpdate("insert into POWERS values('Wolfsbane, 'healing factor')");
         statement.executeUpdate("insert into POWERS values('Banshee, 'sonic scream')");

         rs = statement.executeQuery("SELECT * FROM POWERS");  
         while (rs.next()) 
         {  
             System.out.println("Superhero Character Name:" + rs.getString("charname"));  
             System.out.println("Superhero Superpower:" + rs.getString("superpower"));
         }  


         System.out.println("Welcome to the Marvel Database. Type 1 to display all Marvel character names, Type 2 for info on one Pokemon, Type 3 to see all Pokemon types");
         Scanner scan = new Scanner(System.in);
         String select = scan.nextLine();
   
         switch(select)
         {
            case "1":
            rs = statement.executeQuery("select * from NAMES");
             while(rs.next())  // read the result set
                {
                    System.out.println("Character Name = " + rs.getString("charname"));
                }

            case "2":
            System.out.println("Which Marvel character would you like information on? Type the name.");
            String charname = scan.nextLine();
    
            rs = statement.executeQuery("select * from NAMES WHERE Character Name = '" + charname + "' ");
                while(rs.next())  // read the result set
                    {
                        System.out.println("Superhero Character Name: " + rs.getString("charname"));
                        System.out.println("Superhero Real Name:" + rs.getString("birthname"));
                    }
            rs = statement.executeQuery("select * from TYPE WHERE Character Name = '" + charname + "' ");
                while(rs.next())  // read the result set
                    {
                        System.out.println("Superhero Type: " + rs.getInt("types"));
                    }
                    
            rs = statement.executeQuery("select * from POWERS WHERE Character Name = '" + charname + "' ");
                while(rs.next())  // read the result set
                    {
                        System.out.println("Superhero Superpower: = " + rs.getString("superpower"));
                    }

            case "6":
                    System.out.println("Insert Marvel Character name");
                    String insertname = scan.nextLine();
                    System.out.println("Insert Marvel Character real name");
                    String newname = scan.nextLine();
                    System.out.println("Insert Marvel Character superpower");
                    String newpow = scan.nextLine();
                    System.out.println("Insert Marvel Character type");
                    String newtype = scan.nextLine();
            
                    rs = statement.executeQuery("INSERT INTO NAMES VALUES ('" + insertname + "' , '" +  newname + "') ");
                    rs = statement.executeQuery("INSERT INTO TYPE VALUES ('" + insertname + "' ,'" + newtype + "') ");
                    rs = statement.executeQuery("INSERT INTO POWERS VALUES ('" + insertname + "' ,'" + newpow + "') ");
                        
                    rs = statement.executeQuery("SELECT * FROM NAMES ORDER BY ID DESC LIMIT 1");
                    rs = statement.executeQuery("SELECT * FROM TYPE ORDER BY ID DESC LIMIT 1");
                    rs = statement.executeQuery("SELECT * FROM POWERS ORDER BY ID DESC LIMIT 1");
         }

     } 
     catch (Exception e) 
     {  
         e.printStackTrace();  
     }
     finally 
     {  
         try 
         {  
             rs.close();  
             statement.close();  
             conn.close();  
         } 
         catch (Exception e) 
         {  
             e.printStackTrace();  
         }  
     }  
 }  
}  