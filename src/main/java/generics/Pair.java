package generics;
import com.google.common.base.Objects;


public class Pair<T, E> {
    private T t;
    private E e;

    public Pair(T t, E e) {
        this.t = t;
        this.e = e;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<T, E> pair = (Pair<T, E>) o;
        return Objects.equal(t, pair.t) &&
                Objects.equal(e, pair.e);
    }

}
