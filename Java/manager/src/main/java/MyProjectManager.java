import lt.itakademija.exam.Issue;
import lt.itakademija.exam.Project;
import lt.itakademija.exam.ProjectManager;

import java.util.*;

public class MyProjectManager implements ProjectManager {
    Map<String,Project > projects = new HashMap<String, Project>();

    public Project createProject(String s, String s1) {
        if(s==null || s1==null ) throw new NullPointerException();
        if(s.equals("") || s1.equals("")) throw new IllegalArgumentException();
        projects.put(s,new Project(s,s1));
        return projects.get(s);
    }

    public Collection<Project> getProjects() {
        return new ArrayList<Project>(projects.values());
    }

    public Project getProjectById(String s) {
        return projects.get(s);
    }

    public Issue createIssue(Project project, String s) {
        if(s==null || project==null ) throw new NullPointerException();
        if(s.equals("")) throw new IllegalArgumentException();
        Issue issue = new Issue(project,s);
        projects.get(project.getId()).addIssue(issue);
        return issue;
    }

    public Issue createIssue(String s, String s1) {
            if(s==null || s1==null ) throw new NullPointerException();
            if(s.equals("") || s1.equals("")) throw new IllegalArgumentException();
            Issue issue = new Issue(projects.get(s), s1);
            projects.get(s).addIssue(issue);
            return issue;
    }

    public Collection<Issue> getIssues(Project project) {
        return projects.get(project.getId()).getIssues();
    }

    public Collection<Issue> getIssues(String s) {
        return projects.get(s).getIssues();
    }
}
