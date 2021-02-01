package practice.collections;

import java.util.*;

public class Collections_SortingComparing {

    private final static List<GitRepository> repositories = Arrays.asList(
        new GitRepository("SpringFramework", 580, 987321L),
        new GitRepository("OpenPilot", 94, 17821L),
        new GitRepository("Camunda", 211, 345900L),
        new GitRepository("GeorgeHotz", 211, 190900L)
    );
    
    public static void test() {

        System.out.println(repositories);

        // Old way
        Comparator<GitRepository> repositoryComparator = new Comparator<GitRepository>() {
            @Override
            public int compare(GitRepository o1, GitRepository o2) {
                return 0;
            }
        };

        // Using lambda 3 ways - block, lambda, build in int comparator
        Comparator<GitRepository> starComparator = (o1, o2) -> {
            if ((o1.getStars() - o2.getStars()) != 0)
                return o1.getStars() - o2.getStars();
            else
                return (int) o1.getCommits() - (int) o2.getCommits(); // If numer of start is ame then compare commits
        };
        repositories.sort(Comparator.comparingInt(GitRepository::getStars));
        repositories.sort((o1, o2) -> o1.getStars() - o2.getStars());

        repositories.sort(starComparator);
        System.out.println(repositories);

        repositories.sort(starComparator);
        System.out.println(repositories);


     }
}

class GitRepository {
    private final String id;
    private final String name;
    private int stars;
    private long commits;

    public GitRepository(String name, int stars, long commits) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.stars = stars;
        this.commits = commits;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public long getCommits() {
        return commits;
    }

    @Override
    public String toString() {
        return "GitRepository{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", commits=" + commits +
                '}';
    }
}