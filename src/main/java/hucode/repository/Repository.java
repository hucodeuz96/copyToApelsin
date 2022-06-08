package hucode.repository;

import java.util.List;

public interface Repository<Table,Id> {
    int create(Table model);
    List<Table> readAll();
    int update(Table model);
    int delete(Id id);
    List<Table> findById(Id id);

}
