package codewars.com.micky.estructures.pilas;

public interface ICola<T> {

    void push(final T elementoPush);

    void pop();

    T front();

    int tamano();
}
