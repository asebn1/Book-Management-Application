package com.group.libraryapp.domain.user.loanHistory;

import com.group.libraryapp.domain.user.loanHistory.UserLoanHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {

    UserLoanHistory findByBookNameAndIsReturn(String bookName, boolean isReturn);

}
