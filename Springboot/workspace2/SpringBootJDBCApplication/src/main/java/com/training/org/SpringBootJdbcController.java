package com.training.org;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;*/

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SpringBootJdbcController {
	
	@Autowired
	JdbcTemplate jdbc;
	
	
	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into user(name,email) values ('python','java@gmail.com');");
		return "Data inserted successfully";
	}
	@RequestMapping("/update")
	public String index1() {
		jdbc.execute("UPDATE user SET name = 'python', email = 'python@gmail.com' WHERE name='java';");
		return "Data Updated successfully";
	}
	@RequestMapping("/delete")
	public String index2() {
		jdbc.execute("DELETE FROM user WHERE name = 'python'");
		return "Data deleted successfully";
	}
	@RequestMapping("/list")
	public List < User > findAll() {
		return jdbc.query("select * from user", new StudentMapper());
	}
	
	 @GetMapping("/list1")
	    public String findAll(Model model) {
	        List<User> users = jdbc.query("select * from user", new StudentMapper());
	        model.addAttribute("users", users);
	        return "list_users";
	    }
		
	class StudentMapper implements RowMapper < User > {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        	
        	System.out.println("mapRow is called");
        	User std = new User();
            
            std.setName(rs.getString("name"));
            std.setEmail(rs.getString("email"));
            
            return std;
        }
	}
}

