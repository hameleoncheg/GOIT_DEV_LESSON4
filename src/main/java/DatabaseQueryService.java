import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatabaseQueryService {
    public List<MaxProjectCountClient> findMaxProjectsClient() throws SQLException {
        String filePath = "sql/find_max_projects_client.sql";
        String content = null;
        try {
            content = ReadFile.readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement st = database.getConnection().createStatement();
        ResultSet rs = st.executeQuery(content);
        List<MaxProjectCountClient> maxProjectCountClients = new ArrayList<>();
        while (rs.next()) {
            String name = rs.getString("name");
            int project_count = rs.getInt("project_count");
            maxProjectCountClients.add(new MaxProjectCountClient(rs.getString("name"), rs.getInt("project_count")));
        }
        return maxProjectCountClients;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() throws SQLException {

        String filePath = "sql/find_max_salary_worker.sql";
        String content = null;
        try {
            content = ReadFile.readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement st = database.getConnection().createStatement();
        ResultSet rs = st.executeQuery(content);
        List<MaxSalaryWorker> MaxSalaryWorker = new ArrayList<>();
        while (rs.next()) {
            String name = rs.getString("name");
            int salary = rs.getInt("salary");
            MaxSalaryWorker.add(new MaxSalaryWorker(rs.getString("name"), rs.getInt("salary")));
        }
        return MaxSalaryWorker;
    }

    public List<YoungestEldestWorkers> findYoungestEldestWorkers() throws SQLException {

        String filePath = "sql/find_youngest_eldest_workers.sql";
        String content = null;
        try {
            content = ReadFile.readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement st = database.getConnection().createStatement();
        ResultSet rs = st.executeQuery(content);
        List<YoungestEldestWorkers> YoungestEldestWorkers = new ArrayList<>();
        while (rs.next()) {
            String type = rs.getString("type");
            String name = rs.getString("name");
            Date birthday = rs.getDate("birthday");
            YoungestEldestWorkers.add(new YoungestEldestWorkers(rs.getString("type"), rs.getString("name"), rs.getDate("birthday")));
        }
        return YoungestEldestWorkers;
    }

    public List<ProjectPrices> printProjectPrices() throws SQLException {

        String filePath = "sql/print_project_prices.sql";
        String content = null;
        try {
            content = ReadFile.readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement st = database.getConnection().createStatement();
        ResultSet rs = st.executeQuery(content);
        List<ProjectPrices> ProjectPrices = new ArrayList<>();
        while (rs.next()) {
            String name = rs.getString("name");
            long price = rs.getLong("price");
            ProjectPrices.add(new ProjectPrices(rs.getString("name"), rs.getLong("price")));
        }
        return ProjectPrices;
    }

    public List<LongestProject> findLongestProject() throws SQLException {

        String filePath = "sql/find_longest_project.sql";
        String content = null;
        try {
            content = ReadFile.readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement st = database.getConnection().createStatement();
        ResultSet rs = st.executeQuery(content);
        List<LongestProject> LongestProject = new ArrayList<>();
        while (rs.next()) {
            String name = rs.getString("name");
            int month_count = rs.getInt("month_count");
            LongestProject.add(new LongestProject(rs.getString("name"), rs.getInt("month_count")));
        }
        return LongestProject;
    }


}