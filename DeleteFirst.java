import com.mg6
import com.menghill.Oscaling
import com.mongodb DBCarsor import com.mongodb Detisjecu
Import com.mongudli MongoClient;
import com.mongodb.BasicDBObject;
import com.mongodb.DB; 
import com.mongodb.DBCollection;
import.com.mongodb.MongoClient;
import com.mongodb.DBCursor;

public class DeleteFirst {
	
public class public static void main(String args[])  {
	

MongoClient mongoClient = new MongoClient("localhost", 27017); 
DB db mongoClient.getDB("codesquadz12");
boolean auth = db.authenticate("virat", "panoti".toCharArray());
DBCollection coll = db.getCollection("users");

System.out.println("Collection users selected successfully");
DBObject myDoc = coll.findOne();
coll.remove(myDoc);
DBCursor cursor = coll.find();
int i = 1;

while (cursor.hasNext()) {
System.out.println("Inserted Document: " + i); 
System.out.println(cursor.next());
i++;
}
System.out.println("Document deleted sucessfully ");
}
}
