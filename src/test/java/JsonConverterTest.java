import Model.Etudiant;
import Model.JsonConverter;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class JsonConverterTest {
    @Test
    public void testToJson() {
        Etudiant s = new Etudiant("TAHER" , "KARIMA", "taherkarima@gmail.com", "06894003003", "C130145904");
        JsonConverter jc = new JsonConverter();
        System.out.println(jc.toJson(s));
        Assert.assertEquals("{\"CNE\":\"C130145904\",\"nom\":\"TAHER\",\"prenom\":\"KARIMA\",\"email\":\"taherkarima@gmail.com\",\"phone\":\"06894003003\"}", jc.toJson(s));

    }
    @Test
    public void testFromJson() {
        JsonConverter jc = new JsonConverter();
        String json = "{\"CNE\":\"C130145904\",\"nom\":\"TAHER\",\"prenom\":\"KARIMA\",\"email\":\"taherkarima@gmail.com\",\"phone\":\"06894003003\"}";
        Etudiant e= jc.fromJson(json);
        Assert.assertEquals("TAHER", e.getNom());
        Assert.assertEquals("KARIMA", e.getPrenom());
        Assert.assertEquals("taherkarima@gmail.com", e.getEmail());
        Assert.assertEquals("06894003003", e.getPhone());
        Assert.assertEquals("C130145904", e.getCNE());

    }
}
