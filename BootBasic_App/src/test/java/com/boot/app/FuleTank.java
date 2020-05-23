package com.boot.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class FuleTank {
	@Value("10")
public int id;
	@Value("desel")
public String FuleType;
	@Value("10")
public int capacity;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFuleType() {
	return FuleType;
}
public void setFuleType(String fuleType) {
	FuleType = fuleType;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
@Override
public String toString() {
	return "FuleTank [id=" + id + ", FuleType=" + FuleType + ", capacity=" + capacity + "]";
}

}
