package ne.dio.bankline.ui.statement

import androidx.lifecycle.ViewModel
import ne.dio.bankline.data.BanklineRepository

class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}