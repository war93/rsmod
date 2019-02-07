package gg.rsmod.game.message.codec.encoder

import gg.rsmod.game.message.codec.MessageEncoder
import gg.rsmod.game.message.impl.VarpSmallMessage
import gg.rsmod.game.message.impl.VarpLargeMessage

/**
 * Responsible for extracting values from the [VarpSmallMessage] based on keys.
 *
 * @author Tom <rspsmods@gmail.com>
 */
class VarpLargeEncoder : MessageEncoder<VarpLargeMessage>() {

    override fun extract(message: VarpLargeMessage, key: String): Number = when (key) {
        "id" -> message.id
        "value" -> message.value
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: VarpLargeMessage, key: String): ByteArray = throw Exception("Unhandled value key.")

}