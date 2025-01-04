package impl;

import controller.Student;
import dao.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentServiceImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        // initializing insert query
        String insertQuery = "insert into student(id, name, city) values (?, ?, ?)";
        return this.jdbcTemplate.update(insertQuery, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public int update(Student student) {
        // initializing update query
        String query = "update student set city=? where name=?";
        return this.jdbcTemplate.update(query, student.getCity(), student.getName());
    }

    @Override
    public int delete(int studentId) {
        String deleteQuery = "delete from student where id=?";
        return this.jdbcTemplate.update(deleteQuery, studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        return this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        String selectQuery = "select * from student";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        return this.jdbcTemplate.query(selectQuery, rowMapper);
    }
}
