package edu.wheaton.paxos.logic;

public enum DecreeType
{
	OPAQUE_DECREE,
	ADD_PARTICIPANT,
	REMOVE_PARTICIPANT,
	SET_LEADER,
	REQUEST_LOG,
	SEND_LOG;
}