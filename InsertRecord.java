import com.mongodb.BasicDBObject;
import com.mongodb.DB; 
import com.mongodb.DBCollection;
import.com.mongodb.MongoClient;
import com.mongodb.DBCursor;

public class InsertRecord {
	
public class public static void main(String args[])  {
	
try {
MongoClient mongoClient = new MongoClient("localhost", 27017); 
DB db = mongoClient.getDB("codesquadz12");
System.out.println("Connect to database successfully"); 
boolean auth= db.authenticate("virat",
"panoti".toCharArray());

System.out.println("Authentication:" + auth); 
//DBCollection coll = db.getCollection("emp2");
DBCollection coll = db.getCollection("users");
System.out.println("Collection users selected successfully");
BasicDBObject doc = new BasicDBObject("name", "rabari");
doc.append("salary", 51);
doc.append("city","patna");
doc.append("url", "http://www.rabari.com");
coll.insert(doc);

System.out.println("Document inserted successfully ");
DBCursor cursor = coll.find();
int i = 1;
while(cursor.hasNext())
{
	System.out.println("Inserted Document: " +i);
	System.out.println(cursor.next());
	i++;
}}catch(Exceptino e){
	Sytem.out.println(e.getClass().getName()+ ":" + e.getMessage());
}
}
}