package marker.exc;

public class TransformerLab {
    public final void transform(Object obj) throws NotTransformableException {
        if (!(obj instanceof Transformable)) {
            throw new NotTransformableException(obj.getClass().getName());
        }
    }
}
