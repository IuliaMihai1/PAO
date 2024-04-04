package test.marker.exc;

import marker.exc.NotTransformableException;
import marker.exc.Sofa;
import marker.exc.TransformerLab;

public class TestNotTransformable {
    public static void main(String[] args) throws NotTransformableException {
        Sofa sofa = new Sofa("red", 2);
        TransformerLab factory = new TransformerLab();
        factory.transform(sofa);
    }
}
