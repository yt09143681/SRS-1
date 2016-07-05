package dao;

import java.util.ArrayList;
import java.util.HashMap;


import model.Section;
import model.Transcript;
import model.TranscriptEntry;
import model.User;

public interface TranscriptDao {
	public HashMap<String, TranscriptEntry> findTranscriptByStudent(User user);
	public HashMap<String, TranscriptEntry> getTranscript();
	public void addTranscript(TranscriptEntry transcriptentry);
	public HashMap<String, TranscriptEntry> findEnrollcourseByStudent(User user);
}