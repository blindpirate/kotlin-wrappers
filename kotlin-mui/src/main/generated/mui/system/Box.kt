// Automatically generated - do not modify!

@file:JsModule("@mui/system/Box")
@file:JsNonModule

package mui.system

external interface BoxProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    override var children: react.ReactNode?

    var component: react.ElementType<*>?

    var sx: mui.system.SxProps<mui.system.Theme>?
}

external interface CustomSystemProps : react.Props


@JsName("default")
external val Box: react.FC<BoxProps>
