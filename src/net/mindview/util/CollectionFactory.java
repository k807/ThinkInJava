package net.mindview.util;

import java.util.Collection;

public interface CollectionFactory<T> {
//    Collection<T> create(Object... arg);
    Collection<T> create(String arg);
}
