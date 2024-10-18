package main

import (
	"fmt"
)

type StorageReader struct {
	filenames []string
}

func NewStorageReader(filenames []string) *StorageReader {
	return &StorageReader{filenames: filenames}
}

func findLogSingle(reader *StorageReader, qtext, targetTS string) (bool, int) {
	/*
		Input:
		1. A target timestamp in the format `YYYYMMDD_HHMMSS`
		2. A search text string
		Output:
		- If the search text is found in the file:
			- Return `true`
			- The offset of the search text's start position in the file content string
		- If the search text is not found in the file:
			- Return `false`
			- `-1` to indicate the absence of the text
	*/
	// Implementation omitted
	return false, -1
}

type LogEntry struct {
	Filename string
	Content  string
	Offset   string
}

func findLogsWithRange(qtext, fromTS, toTS string) []LogEntry {
	/*
		1. Input:
			- Two timestamps, `from` and `to`, in the format `YYYYMMDD_HHMMSS`.
			- A search `text` string.
		2. Output: A list of `filenames`, corresponding file `contents` & qtext's offset, that meet both criteria:
			- Fall within the specified timestamp range (including both boundaries).
			- Contain the given search text.
		3. Constraints:
			- The filenames are sorted in ascending order by timestamp.
			- Each log file contains some text content.
			- The system generates a large number of log files, making it impractical to list all files for filtering.
			- The solution should be efficient and scalable, capable of handling millions of log files.
	*/
	// Implementation omitted
	return nil
}

func getFiles() []string {
	// Implement this function to return a list of filenames in the storage
	return nil
}

func main() {
	filenames := getFiles()
	reader := NewStorageReader(filenames)
	found, offset := findLogSingle(reader, "hello", "20240101_003000")
	fmt.Printf("Found: %v, Offset: %d\n", found, offset)
}
