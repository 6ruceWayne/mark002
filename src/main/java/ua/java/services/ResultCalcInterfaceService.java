package ua.java.services;

import ua.java.models.Test;

public interface ResultCalcInterfaceService {

	public void setFinished(boolean isFinish);

	public boolean getFinished();

	public void setTest(Test test);

	public Test getTest();
}
