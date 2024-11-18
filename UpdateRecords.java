import com.mongodb.BasicDBObject;
import com.mongodb.DB; 
import com.mongodb.DBCollection;
import.com.mongodb.MongoClient;
import com.mongodb.DBCursor;

public class UpdateRecords {
	
public class public static void main(String args[])  {
	

MongoClient mongoClient = new MongoClient("localhost", 27017); 
DB db mongoClient.getDB("codesquadz12");
boolean auth = db.authenticate("virat", "panoti".toCharArray());
System.out.println("Authentication:" + auth); 
DBCollection coll = db.getCollection("users");
System.out.println("Connect to database successfully");
DBCusror cursor = coll.find();
while(cursor.hasNext()){
	DBObject updateDocument = cursor.next();
	updateDocument.put("name ","codesquadz");
	coll.save(updateDocument);
}
System.out.println("Document update sucessfully ");
cursor = coll.find();
int i=1;
while(cursor.hasNext())
{
	System.out.println("Updated Document: " +i);
	System.out.println(cursor.next());
	i++;
}
}
}


