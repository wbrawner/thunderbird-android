package app.k9mail.ui.widget.list

import org.koin.dsl.module

val messageListWidgetModule = module {
    single { MessageListWidgetUpdateListener(context = get()) }
    factory { MessageListLoader(preferences = get(), messageListRepository = get(), messageHelper = get()) }
}