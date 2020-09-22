package zelenov.patterns.structurial.facade;

public class WorkFlow {
    Developer developer=new Developer();
    Job job=new Job();
    BugTracker bugTracker=new BugTracker();


    public void solvingProblem(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

}
