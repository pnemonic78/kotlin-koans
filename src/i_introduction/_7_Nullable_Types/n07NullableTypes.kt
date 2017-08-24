package i_introduction._7_Nullable_Types

fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    if (client?.personalInfo?.email == null || message == null) return else mailer.sendMessage(client.personalInfo.email, message)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}
