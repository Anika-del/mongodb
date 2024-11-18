import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class CreatingCollection {
	
public static void main(String args[]) {
	
try {
MongoClient mongoClient = new MongoClient("localhost", 27017);
// Now connect to your databases
DB db = mongoClient.getDB("codesquadz12"); 
System.out.println("Connect to database successfully ");
boolean auth = db.authenticate("virat", "panoti" .toCharArray());
System.out.println("Authentication:" + auth); 
DBCollection coll = db.createCollection("emp26", null);
//DBCollection coll = db.getCollection("mycol2");
System.out.println("Collection created successfully");
} catch (Exception e) { 
  System.err.println(e.getClass().getName()+":"+e.getMessage());
}
}
}
