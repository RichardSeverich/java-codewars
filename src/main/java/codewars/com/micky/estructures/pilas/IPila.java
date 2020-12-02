package codewars.com.micky.estructures.pilas;

public interface IPila<T> {

    void push(final T elementoPush);

    void pop();

    T top();

    int tamano();
}
