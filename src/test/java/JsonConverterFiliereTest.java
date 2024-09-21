import Model.Filiere;
import Model.JsonConverterFiliere;
import org.junit.Assert;
import org.junit.Test;

public class JsonConverterFiliereTest {
    @Test
    public void  test_toJson() {
        Filiere f = new Filiere("GI","M.Atlas");
        JsonConverterFiliere jcf = new JsonConverterFiliere();
        String tf= jcf.toJson(f);
        System.out.println(tf);
        Assert.assertEquals("{\"nom\":\"GI\",\"responsable\":\"M.Atlas\"}", jcf.toJson(f));
    }

    @Test
    public void test_fromJson() {
        String json = "{\"nom\":\"GI\",\"responsable\":\"M.Atlas\"}";
        JsonConverterFiliere jcf = new JsonConverterFiliere();
        Filiere f1 = jcf.fromJson(json);
        Assert.assertEquals("GI", f1.getNom());
        Assert.assertEquals("M.Atlas", f1.getResponsable());
    }
}
