package test.marker.exc;

import marker.exc.Bumblebee;
import marker.exc.NotTransformableException;
import marker.exc.TransformerLab;

public class TestTransformable {
    public static void main(String[] args) throws NotTransformableException {
        Bumblebee bumblebee = new Bumblebee("yellow", true);
        TransformerLab factory = new TransformerLab();
        factory.transform(bumblebee);
    }
}
