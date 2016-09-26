package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public interface Storage {
	
	 public void save(AddressBook addressBook) throws StorageOperationException;	 
	 public AddressBook load() throws StorageOperationException;
	 public String getPath();
}

