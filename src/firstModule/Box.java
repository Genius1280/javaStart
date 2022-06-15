package firstModule;

public class Box<T>
{
    private final T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
