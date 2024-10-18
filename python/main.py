class StorageReader:

    def __init__(self, filenames: list[str]):
        self.filenames = filenames


def find_log_single(
    reader: StorageReader, qtext: str, target_ts: str
) -> tuple[bool, int]:
    """
    ### Input

        1. A target timestamp in the format `YYYYMMDD_HHMMSS`
        2. A search text string

    ### Output

    - If the search text is found in the file:
        - Return `true`
        - The offset of the search text's start position in the file content
        string
    - If the search text is not found in the file:
        - Return `false`
        - `-1` to indicate the absence of the text
    """
    pass


def find_logs_with_range(
    qtext: str, from_ts: str, to_ts: str
) -> list[tuple[str, str, int]]:
    """
    1. **Input**:
        - Two timestamps, `from` and `to`, in the format `YYYYMMDD_HHMMSS`.
        - A search `text` string.
    2. **Output**: A list of `filenames`, corresponding file `contents` and the `offset` of search text's
        start that meet both criteria:
        - Fall within the specified timestamp range (including both boundaries).
        - Contain the given search text.
    3. **Constraints**:
        - The filenames are sorted in ascending order by timestamp.
        - Each log file contains some text content.
        - The system generates a large number of log files, making it impractical to list all files for filtering.
        - The solution should be efficient and scalable, capable of handling millions of log files.
    """
    pass


def get_files() -> list[str]:
    """
    Implement this function to return a list of filenames in the storage
    """
    pass


if __name__ == "__main__":
    filenames = get_files()
    reader = StorageReader(filenames)
    find_log_single(reader, "hello", "log_20240101_003000")
